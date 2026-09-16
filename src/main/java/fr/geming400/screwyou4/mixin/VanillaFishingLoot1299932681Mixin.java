package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.VanillaFishingLoot.class)
public class VanillaFishingLoot1299932681Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_391306413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(391306413L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2070356206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2070356206L))
            info.setReturnValue("-@i \u5AC9\u23A40j>*tqT%`1\uA873:(X]bw@bH#VB\u46C41$\"IQx-XwX\uCC9C<LidC^c.+aL\"!E4x`jf'\u85D3y\u3BE0J\" rS");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1857284772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1857284772L))
            info.setReturnValue(-2072174351);
    }

    @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void generate_1037472020(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1037472020L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void registries__1265792449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1265792449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fishingFishLootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private static void fishingFishLootTable_289079757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(289079757L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable.Builder());
    }


}
