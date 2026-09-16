package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.LocateCommand.class)
public class LocateCommand_1249968693Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;Lnet/minecraft/commands/CommandBuildContext;)V", cancellable = true)
    private static void register__327840664(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-327840664L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showLocateResult(Lnet/minecraft/commands/CommandSourceStack;Lnet/minecraft/commands/arguments/ResourceOrTagArgument$Result;Lnet/minecraft/core/BlockPos;Lcom/mojang/datafixers/util/Pair;Ljava/lang/String;ZLjava/time/Duration;)I", cancellable = true)
    private static void showLocateResult_1888062197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1888062197L))
            info.setReturnValue(658985143);
    }

    @Inject(at = @At("HEAD"), method = "showLocateResult(Lnet/minecraft/commands/CommandSourceStack;Lnet/minecraft/commands/arguments/ResourceOrTagKeyArgument$Result;Lnet/minecraft/core/BlockPos;Lcom/mojang/datafixers/util/Pair;Ljava/lang/String;ZLjava/time/Duration;)I", cancellable = true)
    private static void showLocateResult__1182105188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1182105188L))
            info.setReturnValue(1347214336);
    }


}
