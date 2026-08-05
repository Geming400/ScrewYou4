package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.effects.SpearAnimations.class)
public class SpearAnimations1789947002Mixin {
        @Inject(at = @At("HEAD"), method = "thirdPersonHandUse(Lnet/minecraft/client/model/geom/ModelPart;Lnet/minecraft/client/model/geom/ModelPart;ZLnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private static void thirdPersonHandUse_1607562707(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1607562707L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "thirdPersonAttackHand(Lnet/minecraft/client/model/HumanoidModel;Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private static void thirdPersonAttackHand__510354019(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-510354019L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "thirdPersonAttackItem(Lnet/minecraft/client/renderer/entity/state/ArmedEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private static void thirdPersonAttackItem__252665383(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-252665383L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "thirdPersonUseItem(Lnet/minecraft/client/renderer/entity/state/ArmedEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;FLnet/minecraft/world/entity/HumanoidArm;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private static void thirdPersonUseItem_1346561335(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1346561335L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "firstPersonAttack(FLcom/mojang/blaze3d/vertex/PoseStack;ILnet/minecraft/world/entity/HumanoidArm;)V", cancellable = true)
    private static void firstPersonAttack__1826561505(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1826561505L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "firstPersonUse(FLcom/mojang/blaze3d/vertex/PoseStack;FLnet/minecraft/world/entity/HumanoidArm;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private static void firstPersonUse_163691841(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(163691841L))
            info.cancel();
    }


}
