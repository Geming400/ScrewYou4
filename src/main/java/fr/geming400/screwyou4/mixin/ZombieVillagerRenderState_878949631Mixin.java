package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.ZombieVillagerRenderState.class)
public class ZombieVillagerRenderState_878949631Mixin {
        @Inject(at = @At("HEAD"), method = "getVillagerData()Lnet/minecraft/world/entity/npc/villager/VillagerData;", cancellable = true)
    private void getVillagerData_1584444668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1584444668L))
            info.setReturnValue(null);
    }


}
