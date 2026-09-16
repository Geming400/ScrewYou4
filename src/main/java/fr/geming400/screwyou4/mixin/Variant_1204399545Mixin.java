package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.parrot.Parrot.Variant.class)
public class Variant_1204399545Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/animal/parrot/Parrot$Variant;", cancellable = true)
    private static void values_663126597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(663126597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/animal/parrot/Parrot$Variant;", cancellable = true)
    private static void valueOf__2137470818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2137470818L))
            info.setReturnValue(net.minecraft.world.entity.animal.parrot.Parrot.Variant.RED_BLUE);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId__453924051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-453924051L))
            info.setReturnValue(2089484777);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/entity/animal/parrot/Parrot$Variant;", cancellable = true)
    private static void byId__476576633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-476576633L))
            info.setReturnValue(net.minecraft.world.entity.animal.parrot.Parrot.Variant.BLUE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1292608166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1292608166L))
            info.setReturnValue("u'DxNl2dn\u2A9A$srB`Xz:r-Fi u14@e\u3813{,\u2499y(gTeQ^->\u6724\u6F6F[^5V\u0466CRk|!n/El5rF\u47A6T\u1A23r@iFq");
    }


}
