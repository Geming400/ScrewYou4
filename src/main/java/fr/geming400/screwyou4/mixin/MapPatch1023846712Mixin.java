package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.saveddata.maps.MapItemSavedData.MapPatch.class)
public class MapPatch1023846712Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_115220444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(115220444L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1794270237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1794270237L))
            info.setReturnValue("Cl)\u1A0CE\u536BRB\u619F\uFEC5h:5tlMs\u3852K)?-l\uB72BlDDG4=KlXU\u0900f?0Du\u58CB4T\uC824zYb>\\");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1581198803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1581198803L))
            info.setReturnValue(1740286782);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width__616301288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-616301288L))
            info.setReturnValue(1242920177);
    }

    @Inject(at = @At("HEAD"), method = "startX()I", cancellable = true)
    private void startX__771528536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-771528536L))
            info.setReturnValue(613818556);
    }

    @Inject(at = @At("HEAD"), method = "startY()I", cancellable = true)
    private void startY__742899385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-742899385L))
            info.setReturnValue(-1488702770);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height__61501865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-61501865L))
            info.setReturnValue(-1742491927);
    }

    @Inject(at = @At("HEAD"), method = "applyToMap(Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;)V", cancellable = true)
    private void applyToMap_1749761429(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1749761429L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mapColors()[B", cancellable = true)
    private void mapColors__1518352214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1518352214L))
            info.setReturnValue(null);
    }


}
