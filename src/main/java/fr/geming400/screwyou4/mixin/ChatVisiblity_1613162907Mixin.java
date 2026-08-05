package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.ChatVisiblity.class)
public class ChatVisiblity_1613162907Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/player/ChatVisiblity;", cancellable = true)
    private static void values__582031569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-582031569L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/player/ChatVisiblity;", cancellable = true)
    private static void valueOf__1464494456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1464494456L))
            info.setReturnValue(net.minecraft.world.entity.player.ChatVisiblity.SYSTEM);
    }

    @Inject(at = @At("HEAD"), method = "caption()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void caption_2022687891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2022687891L))
            info.setReturnValue(null);
    }


}
