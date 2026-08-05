package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.RuinedPortalPiece.VerticalPlacement.class)
public class VerticalPlacement833526256Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1055320646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1055320646L))
            info.setReturnValue("wtlZ&\uB08Dvw5IrxH\uB046O.4.DRQFlmK2xG0,YDexE( N3\u9504\u6060KIST6>\u76B0+\u1064M? I{\u4F44|A&V{\uA60BKr6\"\u82C4\u7305x)4S)9\u893C");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/structure/structures/RuinedPortalPiece$VerticalPlacement;", cancellable = true)
    private static void values__962500453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-962500453L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/structures/RuinedPortalPiece$VerticalPlacement;", cancellable = true)
    private static void valueOf_937506420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(937506420L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.structures.RuinedPortalPiece.VerticalPlacement.UNDERGROUND);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_921734878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(921734878L))
            info.setReturnValue("5Y%%uNvktMH!\uB0F0v:+Zx'%,E?*f\u14A8^2< \u3954[x='v\u6025sX`?NxI(\u0F9BE}x4u*xZr*\u25D7A\u74A6{");
    }


}
