package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.VanillaFishingLoot.class)
public class VanillaFishingLoot1299932681Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1609522356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1609522356L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_164472706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(164472706L))
            info.setReturnValue("U㎲ fV'63E|.'諷0#yVY)7u_>!WE팈");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1338195423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1338195423L))
            info.setReturnValue(-826420862);
    }

    @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void generate__438218209(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-438218209L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fishingFishLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private static void fishingFishLootTable_566554793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566554793L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable$Builder());
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void registries_986725348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(986725348L))
            info.setReturnValue(null);
    }


}
