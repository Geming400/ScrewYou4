package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.Mirror.class)
public class Mirror1848274963Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/Mirror;", cancellable = true)
    private static void values__1986088875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1986088875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/Mirror;", cancellable = true)
    private static void valueOf__461861422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-461861422L))
            info.setReturnValue(net.minecraft.world.level.block.Mirror.FRONT_BACK);
    }

    @Inject(at = @At("HEAD"), method = "symbol()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void symbol__328634202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-328634202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRotation(Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private void getRotation_1278564793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1278564793L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.COUNTERCLOCKWISE_90);
    }

    @Inject(at = @At("HEAD"), method = "mirror(Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;", cancellable = true)
    private void mirror__378389998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-378389998L))
            info.setReturnValue(net.minecraft.core.Direction.NORTH);
    }

    @Inject(at = @At("HEAD"), method = "mirror(II)I", cancellable = true)
    private void mirror_852383001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(852383001L))
            info.setReturnValue(-1248496864);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lcom/mojang/math/OctahedralGroup;", cancellable = true)
    private void rotation_911475399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(911475399L))
            info.setReturnValue(com.mojang.math.OctahedralGroup.ROT_180_EDGE_YZ_POS);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_712814492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(712814492L))
            info.setReturnValue("lR1`\u4832WnB3hmN)Z+HA}j/_jz$4#Sa7&{S\uBE51K ;BU7g%$k1Ut(gn\uAE14.V$xkRLyyN\u831Aa\u259F\u3020y'{r");
    }


}
