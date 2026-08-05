package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.EnderDragonRenderState.class)
public class EnderDragonRenderState89008334Mixin {
        @Inject(at = @At("HEAD"), method = "getHistoricalPos(I)Lnet/minecraft/world/entity/boss/enderdragon/DragonFlightHistory$Sample;", cancellable = true)
    private void getHistoricalPos__197896169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-197896169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeadPartYOffset(ILnet/minecraft/world/entity/boss/enderdragon/DragonFlightHistory$Sample;Lnet/minecraft/world/entity/boss/enderdragon/DragonFlightHistory$Sample;)F", cancellable = true)
    private void getHeadPartYOffset__519088357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-519088357L))
            info.setReturnValue(1.78845E8F);
    }


}
