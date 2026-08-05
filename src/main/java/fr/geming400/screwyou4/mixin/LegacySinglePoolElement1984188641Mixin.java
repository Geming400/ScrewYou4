package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.LegacySinglePoolElement.class)
public class LegacySinglePoolElement1984188641Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1540355626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1540355626L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/structure/pools/StructurePoolElementType;", cancellable = true)
    private void getType_1776384307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1776384307L))
            info.setReturnValue(null);
    }


}
