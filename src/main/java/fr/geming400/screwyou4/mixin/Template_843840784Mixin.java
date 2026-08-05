package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.TimeArgument.Info.Template.class)
public class Template_843840784Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private void type__160257486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-160257486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/TimeArgument;", cancellable = true)
    private void instantiate_1012130473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1012130473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void instantiate_1346411830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1346411830L))
            info.setReturnValue(null);
    }


}
