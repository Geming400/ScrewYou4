package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.CardinalLighting.Type.class)
public class Type_302780580Mixin {
        @Inject(at = @At("HEAD"), method = "get()Lnet/minecraft/world/level/CardinalLighting;", cancellable = true)
    private void get__806328097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-806328097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/CardinalLighting$Type;", cancellable = true)
    private static void values__1034249454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1034249454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/CardinalLighting$Type;", cancellable = true)
    private static void valueOf__1916712341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1916712341L))
            info.setReturnValue(net.minecraft.world.level.CardinalLighting.Type.NETHER);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_390989201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(390989201L))
            info.setReturnValue("\u7691!o8FIppi 6");
    }


}
