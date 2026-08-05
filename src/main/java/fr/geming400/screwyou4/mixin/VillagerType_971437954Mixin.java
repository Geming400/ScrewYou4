package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.npc.villager.VillagerType.class)
public class VillagerType_971437954Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/world/entity/npc/villager/VillagerType;", cancellable = true)
    private static void bootstrap_73661851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(73661851L))
            info.setReturnValue(new net.minecraft.world.entity.npc.villager.VillagerType());
    }

    @Inject(at = @At("HEAD"), method = "byBiome(Lnet/minecraft/core/Holder;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void byBiome_451329026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(451329026L))
            info.setReturnValue(null);
    }


}
