package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.PlayerModelType.class)
public class PlayerModelType_1922723388Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/player/PlayerModelType;", cancellable = true)
    private static void values__1281674607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1281674607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/player/PlayerModelType;", cancellable = true)
    private static void valueOf_1075015594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1075015594L))
            info.setReturnValue(net.minecraft.world.entity.player.PlayerModelType.WIDE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_2010932009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2010932009L))
            info.setReturnValue(" [3v\u66AE\u8F2Eg\uAC6Ea\u056AR\uC95F9y}\u65355\u75A9-skfR0\uB052\u032341m3\u5019\u2298g0vA\u99E5Te.>u\u2827\u373B/ _R\uC08BIT>XF\uBE22IndVcex");
    }

    @Inject(at = @At("HEAD"), method = "byLegacyServicesName(Ljava/lang/String;)Lnet/minecraft/world/entity/player/PlayerModelType;", cancellable = true)
    private static void byLegacyServicesName__1367217975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1367217975L))
            info.setReturnValue(net.minecraft.world.entity.player.PlayerModelType.SLIM);
    }


}
