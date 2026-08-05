package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.FunctionCommand.class)
public class FunctionCommand2011086661Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;)V", cancellable = true)
    private static void register_1067526438(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1067526438L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modifySenderForExecution(Lnet/minecraft/commands/CommandSourceStack;)Lnet/minecraft/commands/CommandSourceStack;", cancellable = true)
    private static void modifySenderForExecution__914794194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-914794194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "queueFunctions(Ljava/util/Collection;Lnet/minecraft/nbt/CompoundTag;Lnet/minecraft/commands/ExecutionCommandSource;Lnet/minecraft/commands/ExecutionCommandSource;Lnet/minecraft/commands/execution/ExecutionControl;Lnet/minecraft/server/commands/FunctionCommand$Callbacks;Lnet/minecraft/commands/execution/ChainModifiers;)V", cancellable = true)
    private static void queueFunctions__460306041(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-460306041L))
            info.cancel();
    }


}
