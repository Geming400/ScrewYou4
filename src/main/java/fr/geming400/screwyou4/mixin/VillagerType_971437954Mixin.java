package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.npc.villager.VillagerType.class)
public class VillagerType_971437954Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/world/entity/npc/villager/VillagerType;", cancellable = true)
    private static void bootstrap__811747383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-811747383L))
            info.setReturnValue(new net.minecraft.world.entity.npc.villager.VillagerType());
    }

    @Inject(at = @At("HEAD"), method = "byBiome(Lnet/minecraft/core/Holder;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void byBiome_611673593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(611673593L))
            info.setReturnValue(null);
    }


}
