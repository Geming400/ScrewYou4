package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceSelectorArgument.Info.Template.class)
public class Template_127554512Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private void type__910694932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-910694932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/ResourceSelectorArgument;", cancellable = true)
    private void instantiate__918454573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-918454573L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void instantiate__1678768480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1678768480L))
            info.setReturnValue(null);
    }


}
