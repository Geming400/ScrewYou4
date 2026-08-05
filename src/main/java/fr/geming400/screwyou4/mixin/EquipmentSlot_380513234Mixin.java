package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EquipmentSlot.class)
public class EquipmentSlot_380513234Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1508333669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1508333669L))
            info.setReturnValue("HMce$}['F;t\uCA84658Y@*tyJ0{/\u21BC!UGl\u70CE`6B8:zc\u1E823q#\u2168jA\"-O4");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/EquipmentSlot;", cancellable = true)
    private static void values__2075308067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2075308067L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/EquipmentSlot;", cancellable = true)
    private static void valueOf_1637630628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1637630628L))
            info.setReturnValue(net.minecraft.world.entity.EquipmentSlot.CHEST);
    }

    @Inject(at = @At("HEAD"), method = "limit(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void limit_2071015147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071015147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId__1277810362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1277810362L))
            info.setReturnValue(-836398218);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/entity/EquipmentSlot$Type;", cancellable = true)
    private void getType_617342680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617342680L))
            info.setReturnValue(net.minecraft.world.entity.EquipmentSlot.Type.SADDLE);
    }

    @Inject(at = @At("HEAD"), method = "getIndex()I", cancellable = true)
    private void getIndex_776881179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776881179L))
            info.setReturnValue(2021958053);
    }

    @Inject(at = @At("HEAD"), method = "getIndex(I)I", cancellable = true)
    private void getIndex__189207476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-189207476L))
            info.setReturnValue(-316706571);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;)Lnet/minecraft/world/entity/EquipmentSlot;", cancellable = true)
    private static void byName_92759806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(92759806L))
            info.setReturnValue(net.minecraft.world.entity.EquipmentSlot.FEET);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_468721855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(468721855L))
            info.setReturnValue("o-|6Gy`S +@cI,[k%m}`\u7BB6^&\u7AC0B1vFL`4{,\u6D23ztD\uA389+,E4\uA054\u3A51F@PK9\u4477LaixE'qZu\uBC7Ek\u862C\u0609\uB15CIUJ\u92F3'w3xZ=JF");
    }

    @Inject(at = @At("HEAD"), method = "canIncreaseExperience()Z", cancellable = true)
    private void canIncreaseExperience_1103459788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1103459788L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getFilterBit(I)I", cancellable = true)
    private void getFilterBit_618016431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(618016431L))
            info.setReturnValue(169648101);
    }

    @Inject(at = @At("HEAD"), method = "isArmor()Z", cancellable = true)
    private void isArmor_501927027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(501927027L))
            info.setReturnValue(false);
    }


}
