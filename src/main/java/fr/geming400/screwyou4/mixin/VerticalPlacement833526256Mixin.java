package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.RuinedPortalPiece.VerticalPlacement.class)
public class VerticalPlacement833526256Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__301934215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-301934215L))
            info.setReturnValue("EiHH崙툎dF4#/EWO6↯E\"(@s)K-|_;o9[QD▥ORuP]L5T}쵱GM)hy[[,");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/structure/structures/RuinedPortalPiece$VerticalPlacement;", cancellable = true)
    private static void values_1343202297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1343202297L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/structures/RuinedPortalPiece$VerticalPlacement;", cancellable = true)
    private static void valueOf_110279324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(110279324L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.structures.RuinedPortalPiece.VerticalPlacement.IN_NETHER);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__301934215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-301934215L))
            info.setReturnValue("EiHH崙툎dF4#/EWO6↯E\"(@s)K-|_;o9[QD▥ORuP]L5T}쵱GM)hy[[,");
    }


}
