package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.storage.RegionStorageInfo.class)
public class RegionStorageInfo1088013719Mixin {
        @Inject(at = @At("HEAD"), method = "type()Ljava/lang/String;", cancellable = true)
    private void type__47446752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-47446752L))
            info.setReturnValue("XXC\u7672OFZ'Yu\"iQ.@\uC6B6?%<ej\uA662%a\u1A49L+WD\uA159\uA006\u6D1ArO7iQ\u1451\u63BA'\uAAF5KtT-Rd;A6@)5@\u8176\uFA0DZ$\uD7DEk\uCED7");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1821441318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1821441318L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__47446256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-47446256L))
            info.setReturnValue("9&\u3274&#K&Pf.^^0v6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1126276461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1126276461L))
            info.setReturnValue(1059640415);
    }

    @Inject(at = @At("HEAD"), method = "level()Ljava/lang/String;", cancellable = true)
    private void level__47446752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-47446752L))
            info.setReturnValue("XXC\u7672OFZ'Yu\"iQ.@\uC6B6?%<ej\uA662%a\u1A49L+WD\uA159\uA006\u6D1ArO7iQ\u1451\u63BA'\uAAF5KtT-Rd;A6@)5@\u8176\uFA0DZ$\uD7DEk\uCED7");
    }

    @Inject(at = @At("HEAD"), method = "withTypeSuffix(Ljava/lang/String;)Lnet/minecraft/world/level/chunk/storage/RegionStorageInfo;", cancellable = true)
    private void withTypeSuffix__1486657950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1486657950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dimension()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void dimension_1896505032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1896505032L))
            info.setReturnValue(null);
    }


}
