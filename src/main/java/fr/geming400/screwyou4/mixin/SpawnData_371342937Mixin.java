package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.SpawnData.class)
public class SpawnData_371342937Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1756855195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1756855195L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__764117039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764117039L))
            info.setReturnValue("u됋q'<q펿S&倸PqnOtB>ad%0X膼ﶧ$.E瑋ek' 2B鐶]s#)P:Lv`}NSX");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_409605678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(409605678L))
            info.setReturnValue(658845596);
    }

    @Inject(at = @At("HEAD"), method = "equipment()Ljava/util/Optional;", cancellable = true)
    private void equipment_616804358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(616804358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityToSpawn()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getEntityToSpawn__1198879984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1198879984L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "getEquipment()Ljava/util/Optional;", cancellable = true)
    private void getEquipment_616804358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(616804358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCustomSpawnRules()Ljava/util/Optional;", cancellable = true)
    private void getCustomSpawnRules_616804358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(616804358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customSpawnRules()Ljava/util/Optional;", cancellable = true)
    private void customSpawnRules_616804358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(616804358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityToSpawn()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void entityToSpawn__1198879984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1198879984L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }


}
