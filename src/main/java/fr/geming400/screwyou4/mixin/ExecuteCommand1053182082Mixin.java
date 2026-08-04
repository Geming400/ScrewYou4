package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.ExecuteCommand.class)
public class ExecuteCommand1053182082Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;Lnet/minecraft/commands/CommandBuildContext;)V", cancellable = true)
    private static void register__1034175495(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1034175495L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "scheduleFunctionConditionsAndTest(Lnet/minecraft/commands/ExecutionCommandSource;Ljava/util/List;Ljava/util/function/Function;Ljava/util/function/IntPredicate;Lcom/mojang/brigadier/context/ContextChain;Lnet/minecraft/nbt/CompoundTag;Lnet/minecraft/commands/execution/ExecutionControl;Lnet/minecraft/server/commands/InCommandFunction;Lnet/minecraft/commands/execution/ChainModifiers;)V", cancellable = true)
    private static void scheduleFunctionConditionsAndTest__348304279(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-348304279L))
            info.cancel();
    }


}
