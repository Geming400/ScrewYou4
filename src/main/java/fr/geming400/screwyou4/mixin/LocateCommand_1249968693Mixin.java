package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.LocateCommand.class)
public class LocateCommand_1249968693Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;Lnet/minecraft/commands/CommandBuildContext;)V", cancellable = true)
    private static void register__837388885(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-837388885L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showLocateResult(Lnet/minecraft/commands/CommandSourceStack;Lnet/minecraft/commands/arguments/ResourceOrTagArgument$Result;Lnet/minecraft/core/BlockPos;Lcom/mojang/datafixers/util/Pair;Ljava/lang/String;ZLjava/time/Duration;)I", cancellable = true)
    private static void showLocateResult_266149705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(266149705L))
            info.setReturnValue(1449513305);
    }

    @Inject(at = @At("HEAD"), method = "showLocateResult(Lnet/minecraft/commands/CommandSourceStack;Lnet/minecraft/commands/arguments/ResourceOrTagKeyArgument$Result;Lnet/minecraft/core/BlockPos;Lcom/mojang/datafixers/util/Pair;Ljava/lang/String;ZLjava/time/Duration;)I", cancellable = true)
    private static void showLocateResult__1195074360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1195074360L))
            info.setReturnValue(-1368328300);
    }


}
