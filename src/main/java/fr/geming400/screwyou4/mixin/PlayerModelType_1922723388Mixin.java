package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.PlayerModelType.class)
public class PlayerModelType_1922723388Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/player/PlayerModelType;", cancellable = true)
    private static void values_277308271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(277308271L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/player/PlayerModelType;", cancellable = true)
    private static void valueOf__1047583278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1047583278L))
            info.setReturnValue(net.minecraft.world.entity.player.PlayerModelType.WIDE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_787262916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(787262916L))
            info.setReturnValue("Kqd( #:&!1i7.[ng0D4Zo\uD767O\u27EFE\u950ET$e)\u775Bk)9\uB9D6");
    }

    @Inject(at = @At("HEAD"), method = "byLegacyServicesName(Ljava/lang/String;)Lnet/minecraft/world/entity/player/PlayerModelType;", cancellable = true)
    private static void byLegacyServicesName__1047583278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1047583278L))
            info.setReturnValue(net.minecraft.world.entity.player.PlayerModelType.WIDE);
    }


}
