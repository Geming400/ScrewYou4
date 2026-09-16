package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.effects.SpearAnimations.class)
public class SpearAnimations1789947002Mixin {
        @Inject(at = @At("HEAD"), method = "thirdPersonAttackHand(Lnet/minecraft/client/model/HumanoidModel;Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private static void thirdPersonAttackHand_1445682602(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1445682602L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "thirdPersonHandUse(Lnet/minecraft/client/model/geom/ModelPart;Lnet/minecraft/client/model/geom/ModelPart;ZLnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private static void thirdPersonHandUse_1852720431(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1852720431L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "firstPersonUse(FLcom/mojang/blaze3d/vertex/PoseStack;FLnet/minecraft/world/entity/HumanoidArm;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private static void firstPersonUse_85567587(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(85567587L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "firstPersonAttack(FLcom/mojang/blaze3d/vertex/PoseStack;ILnet/minecraft/world/entity/HumanoidArm;)V", cancellable = true)
    private static void firstPersonAttack_380703340(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(380703340L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "thirdPersonUseItem(Lnet/minecraft/client/renderer/entity/state/ArmedEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;FLnet/minecraft/world/entity/HumanoidArm;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private static void thirdPersonUseItem_1888678325(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1888678325L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "thirdPersonAttackItem(Lnet/minecraft/client/renderer/entity/state/ArmedEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private static void thirdPersonAttackItem_955343106(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(955343106L))
            info.cancel();
    }


}
