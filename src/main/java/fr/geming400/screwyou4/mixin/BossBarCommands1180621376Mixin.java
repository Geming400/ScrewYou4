package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.BossBarCommands.class)
public class BossBarCommands1180621376Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;Lnet/minecraft/commands/CommandBuildContext;)V", cancellable = true)
    private static void register__906736201(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-906736201L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBossBar(Lcom/mojang/brigadier/context/CommandContext;)Lnet/minecraft/server/bossevents/CustomBossEvent;", cancellable = true)
    private static void getBossBar__1280199957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1280199957L))
            info.setReturnValue(null);
    }


}
