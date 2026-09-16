package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.SpawnData.class)
public class SpawnData_371342937Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__537283332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-537283332L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1141766461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1141766461L))
            info.setReturnValue("\u90DE\u0721ARP+]JN%u[maY\u6354YMq| e-buncO\uCD84\uC4B4p_|0L\u76A1\u191C9\u6331WUt|\u5681_rsF\u4CEEx d1\u8FC2H>U;\")<?jj|S\u78C8O\u9A9Aw");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_928695027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(928695027L))
            info.setReturnValue(2077757439);
    }

    @Inject(at = @At("HEAD"), method = "getCustomSpawnRules()Ljava/util/Optional;", cancellable = true)
    private void getCustomSpawnRules__1814305015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1814305015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityToSpawn()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getEntityToSpawn__950850295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-950850295L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "getEquipment()Ljava/util/Optional;", cancellable = true)
    private void getEquipment__134742306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-134742306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customSpawnRules()Ljava/util/Optional;", cancellable = true)
    private void customSpawnRules__1765473901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1765473901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityToSpawn()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void entityToSpawn__1318707821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1318707821L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equipment()Ljava/util/Optional;", cancellable = true)
    private void equipment__1483256940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1483256940L))
            info.setReturnValue(null);
    }


}
