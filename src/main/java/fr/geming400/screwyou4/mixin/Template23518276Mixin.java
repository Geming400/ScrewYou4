package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.brigadier.DoubleArgumentInfo.Template.class)
public class Template23518276Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private void type__980579993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-980579993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/DoubleArgumentType;", cancellable = true)
    private void instantiate_1055728858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1055728858L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void instantiate_526089323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(526089323L))
            info.setReturnValue(null);
    }


}
