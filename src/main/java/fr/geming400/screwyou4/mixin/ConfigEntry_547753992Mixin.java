package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.validation.PathAllowList.ConfigEntry.class)
public class ConfigEntry_547753992Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/validation/PathAllowList$EntryType;", cancellable = true)
    private void type__391492507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-391492507L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1933266250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1933266250L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__587705984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-587705984L))
            info.setReturnValue("=#A\uD648\u1A5D@MH%_hJ.l\u5764D\uD50ADIXbivT<$4F>h=\uCB93Q\u563F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_586016733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(586016733L))
            info.setReturnValue(-967208743);
    }

    @Inject(at = @At("HEAD"), method = "compile(Ljava/nio/file/FileSystem;)Ljava/nio/file/PathMatcher;", cancellable = true)
    private void compile__466931038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-466931038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pattern()Ljava/lang/String;", cancellable = true)
    private void pattern__587706480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-587706480L))
            info.setReturnValue("'&0u(*(nLy\"\u4F975.1TsE]\uC8DAQ0dGElqr51F\u64DC5$ 4hw3uHH\u7037");
    }

    @Inject(at = @At("HEAD"), method = "parse(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private static void parse__1737177501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1737177501L))
            info.setReturnValue(null);
    }


}
