package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.brigadier.FloatArgumentInfo.Template.class)
public class Template_1429805873Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private void type_391556429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(391556429L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/FloatArgumentType;", cancellable = true)
    private void instantiate_1966135687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1966135687L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void instantiate__376517119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-376517119L))
            info.setReturnValue(null);
    }


}
