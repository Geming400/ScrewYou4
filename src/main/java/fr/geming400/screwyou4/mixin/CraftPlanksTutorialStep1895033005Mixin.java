package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.tutorial.CraftPlanksTutorialStep.class)
public class CraftPlanksTutorialStep1895033005Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1933307744(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1933307744L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1933307744(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1933307744L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGetItem(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void onGetItem__665403003(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-665403003L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasCraftedPlanksPreviously(Lnet/minecraft/client/player/LocalPlayer;Lnet/minecraft/tags/TagKey;)Z", cancellable = true)
    private static void hasCraftedPlanksPreviously__744214333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-744214333L))
            info.setReturnValue(null);
    }


}
