package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.brigadier.DoubleArgumentInfo.Template.class)
public class Template23518276Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private void type__1014731167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1014731167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/DoubleArgumentType;", cancellable = true)
    private void instantiate__107212796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-107212796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void instantiate__1782804715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1782804715L))
            info.setReturnValue(null);
    }


}
