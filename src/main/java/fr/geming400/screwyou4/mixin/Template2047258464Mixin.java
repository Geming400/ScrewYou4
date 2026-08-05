package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.brigadier.StringArgumentSerializer.Template.class)
public class Template2047258464Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private void type_1043160195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1043160195L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/StringArgumentType;", cancellable = true)
    private void instantiate_1445071798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1445071798L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/commands/CommandBuildContext;)Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void instantiate__1745137785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1745137785L))
            info.setReturnValue(null);
    }


}
