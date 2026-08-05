package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.LegacySinglePoolElement.class)
public class LegacySinglePoolElement1984188641Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_848728170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(848728170L))
            info.setReturnValue("K>\"fdp(UbDp*$t3ꆢ");
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/levelgen/structure/pools/StructurePoolElementType;", cancellable = true)
    private void getType__1687577885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1687577885L))
            info.setReturnValue(null);
    }


}
