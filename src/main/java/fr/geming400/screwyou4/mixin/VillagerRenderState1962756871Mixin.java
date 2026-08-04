package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.VillagerRenderState.class)
public class VillagerRenderState1962756871Mixin {
        @Inject(at = @At("HEAD"), method = "getVillagerData()Lnet/minecraft/world/entity/npc/villager/VillagerData;", cancellable = true)
    private void getVillagerData__1626715387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1626715387L))
            info.setReturnValue(null);
    }


}
