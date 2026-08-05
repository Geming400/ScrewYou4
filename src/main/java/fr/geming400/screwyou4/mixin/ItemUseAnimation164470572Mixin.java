package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ItemUseAnimation.class)
public class ItemUseAnimation164470572Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private static void values__1379942316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1379942316L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private static void valueOf_485856695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(485856695L))
            info.setReturnValue(net.minecraft.world.item.ItemUseAnimation.CROSSBOW);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_202732818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202732818L))
            info.setReturnValue(448455027);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__970989899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-970989899L))
            info.setReturnValue("#9d|G)f!");
    }

    @Inject(at = @At("HEAD"), method = "hasCustomArmTransform()Z", cancellable = true)
    private void hasCustomArmTransform_202749155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202749155L))
            info.setReturnValue(true);
    }


}
