package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.tutorial.CraftPlanksTutorialStep.class)
public class CraftPlanksTutorialStep1895033005Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1109205299(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1109205299L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1765349347(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1765349347L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGetItem(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void onGetItem__596270053(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-596270053L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasCraftedPlanksPreviously(Lnet/minecraft/client/player/LocalPlayer;Lnet/minecraft/tags/TagKey;)Z", cancellable = true)
    private static void hasCraftedPlanksPreviously_1087753513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1087753513L))
            info.setReturnValue(false);
    }


}
