package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.saveddata.maps.MapDecorationType.class)
public class MapDecorationType_862423064Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2047031974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2047031974L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__273036912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-273036912L))
            info.setReturnValue("애tvg: Y&K\"F`=P|d&剬k䫰}Xk QD>gdc-^4/[K傫6kQh淊hssX勉5z쌔Fh紌!t)鰓ᵐ5o贩;$;洏qZN郧ᎴGfGNL'");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_900685805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(900685805L))
            info.setReturnValue(-1036471794);
    }

    @Inject(at = @At("HEAD"), method = "assetId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void assetId__1580643490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1580643490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "explorationMapElement()Z", cancellable = true)
    private void explorationMapElement_900701646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(900701646L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "showOnItemFrame()Z", cancellable = true)
    private void showOnItemFrame_900701646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(900701646L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "trackCount()Z", cancellable = true)
    private void trackCount_900701646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(900701646L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mapColor()I", cancellable = true)
    private void mapColor_900685309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(900685309L))
            info.setReturnValue(-833324374);
    }

    @Inject(at = @At("HEAD"), method = "hasMapColor()Z", cancellable = true)
    private void hasMapColor_900701646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(900701646L))
            info.setReturnValue(false);
    }


}
