package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.brigadier.LongArgumentInfo.Template.class)
public class Template_734102919Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private void type__269995351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-269995351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/LongArgumentType;", cancellable = true)
    private void instantiate_767008081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(767008081L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void instantiate_1236673965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1236673965L))
            info.setReturnValue(null);
    }


}
