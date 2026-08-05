package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.DifficultyCommand.class)
public class DifficultyCommand299731458Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;)V", cancellable = true)
    private static void register__643828765(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-643828765L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDifficulty(Lnet/minecraft/commands/CommandSourceStack;Lnet/minecraft/world/Difficulty;)I", cancellable = true)
    private static void setDifficulty_989992261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(989992261L))
            info.setReturnValue(1925237415);
    }


}
