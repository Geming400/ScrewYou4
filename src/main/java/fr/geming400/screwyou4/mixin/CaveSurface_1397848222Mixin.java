package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.placement.CaveSurface.class)
public class CaveSurface_1397848222Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/placement/CaveSurface;", cancellable = true)
    private static void values_1535585739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1535585739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/placement/CaveSurface;", cancellable = true)
    private static void valueOf_616411794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(616411794L))
            info.setReturnValue(net.minecraft.world.level.levelgen.placement.CaveSurface.CEILING);
    }

    @Inject(at = @At("HEAD"), method = "getY()I", cancellable = true)
    private void getY__1993681760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1993681760L))
            info.setReturnValue(-444728537);
    }

    @Inject(at = @At("HEAD"), method = "getDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getDirection__2101919823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2101919823L))
            info.setReturnValue(net.minecraft.core.Direction.EAST);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1486056843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1486056843L))
            info.setReturnValue("h\u336B\u3A77NYwW1+,\u9F4FzbayCr\u92817geeFk\u6FF9k5uAQC\uC6CF0y&CCgq/\u4C9C$A\u1305\uD533:K\u149AjQ:\uA837\u18A8\u091C)X\u41633Wl,.cv=");
    }


}
