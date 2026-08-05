package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceOrTagKeyArgument.Info.Template.class)
public class Template1378122105Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private void type_374023836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(374023836L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/ResourceOrTagKeyArgument;", cancellable = true)
    private void instantiate__1876044950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1876044950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void instantiate_1880693152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1880693152L))
            info.setReturnValue(null);
    }


}
