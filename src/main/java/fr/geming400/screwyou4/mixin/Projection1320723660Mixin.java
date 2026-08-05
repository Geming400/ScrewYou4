package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool.Projection.class)
public class Projection1320723660Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__568123242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-568123242L))
            info.setReturnValue("@Y+b\uB586@e\uC852D\uA151r>pn;b^\u4F19|es\u14A72p]h#\u3B49\uD5BENT\uD018S:T[");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/structure/pools/StructureTemplatePool$Projection;", cancellable = true)
    private static void values_226935916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(226935916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/pools/StructureTemplatePool$Projection;", cancellable = true)
    private static void valueOf_752515909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(752515909L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool.Projection.TERRAIN_MATCHING);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/pools/StructureTemplatePool$Projection;", cancellable = true)
    private static void byName_704504491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(704504491L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool.Projection.RIGID);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1408932282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1408932282L))
            info.setReturnValue("\uCE26\"k*\u9980rb\uAF9EB?vfQDUo\u2218D#?Gd<:TMwqHa\u178Fd/8FR^");
    }

    @Inject(at = @At("HEAD"), method = "getProcessors()Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private void getProcessors__847298310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-847298310L))
            info.setReturnValue(null);
    }


}
