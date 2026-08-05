package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.EnderDragonRenderState.class)
public class EnderDragonRenderState89008334Mixin {
        @Inject(at = @At("HEAD"), method = "getHistoricalPos(I)Lnet/minecraft/world/entity/boss/enderdragon/DragonFlightHistory$Sample;", cancellable = true)
    private void getHistoricalPos_118909195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(118909195L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeadPartYOffset(ILnet/minecraft/world/entity/boss/enderdragon/DragonFlightHistory$Sample;Lnet/minecraft/world/entity/boss/enderdragon/DragonFlightHistory$Sample;)F", cancellable = true)
    private void getHeadPartYOffset__1159639912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1159639912L))
            info.setReturnValue(9.150296E8F);
    }


}
