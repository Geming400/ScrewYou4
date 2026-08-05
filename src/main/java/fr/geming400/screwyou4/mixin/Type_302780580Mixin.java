package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.CardinalLighting.Type.class)
public class Type_302780580Mixin {
        @Inject(at = @At("HEAD"), method = "get()Lnet/minecraft/world/level/CardinalLighting;", cancellable = true)
    private void get__2136007287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2136007287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/CardinalLighting$Type;", cancellable = true)
    private static void values__71734416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-71734416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/CardinalLighting$Type;", cancellable = true)
    private static void valueOf_1938057875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1938057875L))
            info.setReturnValue(net.minecraft.world.level.CardinalLighting.Type.DEFAULT);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__832679892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-832679892L))
            info.setReturnValue("\u687D\u0947\")UICs$XT");
    }


}
