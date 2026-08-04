package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.brigadier.StringArgumentSerializer.Template.class)
public class Template2047258464Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private void type_1009009021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1009009021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/StringArgumentType;", cancellable = true)
    private void instantiate_282130144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(282130144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void instantiate_240935473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(240935473L))
            info.setReturnValue(null);
    }


}
