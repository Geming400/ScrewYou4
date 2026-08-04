package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.brigadier.IntegerArgumentInfo.Template.class)
public class Template515668205Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private void type__522581238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-522581238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/IntegerArgumentType;", cancellable = true)
    private void instantiate_1247668194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1247668194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void instantiate__1290654786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1290654786L))
            info.setReturnValue(null);
    }


}
