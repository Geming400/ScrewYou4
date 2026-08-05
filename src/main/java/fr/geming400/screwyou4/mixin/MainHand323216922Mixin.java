package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.select.MainHand.class)
public class MainHand323216922Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Lnet/minecraft/world/entity/HumanoidArm;", cancellable = true)
    private void get_446626763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(446626763L))
            info.setReturnValue(net.minecraft.world.entity.HumanoidArm.RIGHT);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/Object;", cancellable = true)
    private void get__1765097284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1765097284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private void type_1484035326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1484035326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__585409346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-585409346L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1093640447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1093640447L))
            info.setReturnValue("\uBCE5`\uB55A\uA6ADF4[3KL\u14F3\u4BE4ZWI;?VtA\uA3ABx7Rhy4P\u16F2fF+`s}bJjj+,XNT.H[f_D..Z4LHU>;L((pG{V5\uC6671> e.1$R`8/IbzAq+z\u5AF6zd}RFH");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_880569013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(880569013L))
            info.setReturnValue(-1360372970);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec_356768005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(356768005L))
            info.setReturnValue(null);
    }


}
