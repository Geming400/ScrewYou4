package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.MonsterRoomFeature.class)
public class MonsterRoomFeature_2121242377Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place__1458467184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1458467184L))
            info.setReturnValue(null);
    }


}
