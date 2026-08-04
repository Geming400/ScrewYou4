package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.brigadier.LongArgumentInfo.Template.class)
public class Template_734102919Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private void type__304146525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-304146525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/LongArgumentType;", cancellable = true)
    private void instantiate__1835316485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1835316485L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void instantiate__1072220073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1072220073L))
            info.setReturnValue(null);
    }


}
