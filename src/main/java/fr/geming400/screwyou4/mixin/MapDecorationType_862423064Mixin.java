package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.saveddata.maps.MapDecorationType.class)
public class MapDecorationType_862423064Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__46203205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-46203205L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1632846588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632846588L))
            info.setReturnValue("ojg'lLNWny\u04B1DYkjsJ(B\u765F\u091B\uC3C2<D2eg!:r>");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1419775154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1419775154L))
            info.setReturnValue(-730836756);
    }

    @Inject(at = @At("HEAD"), method = "assetId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void assetId__1084851063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1084851063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trackCount()Z", cancellable = true)
    private void trackCount_1249675722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1249675722L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mapColor()I", cancellable = true)
    private void mapColor__1877552394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1877552394L))
            info.setReturnValue(-1095188413);
    }

    @Inject(at = @At("HEAD"), method = "explorationMapElement()Z", cancellable = true)
    private void explorationMapElement__1207817429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1207817429L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "showOnItemFrame()Z", cancellable = true)
    private void showOnItemFrame_242342096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(242342096L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasMapColor()Z", cancellable = true)
    private void hasMapColor__440583603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-440583603L))
            info.setReturnValue(true);
    }


}
