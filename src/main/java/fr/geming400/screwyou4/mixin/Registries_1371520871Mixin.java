package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.registries.Registries.class)
public class Registries_1371520871Mixin {
        @Inject(at = @At("HEAD"), method = "levelStemToLevel(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void levelStemToLevel_1443285935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1443285935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "levelToLevelStem(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private static void levelToLevelStem__441373279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-441373279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "elementsDirPath(Lnet/minecraft/resources/ResourceKey;)Ljava/lang/String;", cancellable = true)
    private static void elementsDirPath__1666073176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1666073176L))
            info.setReturnValue("6jDc4tyCj1HacU\u2A0AG/g");
    }

    @Inject(at = @At("HEAD"), method = "tagsDirPath(Lnet/minecraft/resources/ResourceKey;)Ljava/lang/String;", cancellable = true)
    private static void tagsDirPath_913367114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(913367114L))
            info.setReturnValue("]_GgeSD/<'f18dw\u8D5F'd\uCD37@`\uA5C4");
    }

    @Inject(at = @At("HEAD"), method = "componentsDirPath(Lnet/minecraft/resources/ResourceKey;)Ljava/lang/String;", cancellable = true)
    private static void componentsDirPath_2113600519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2113600519L))
            info.setReturnValue("$e7x}uzq\u46E7w\u12CElrEKaw\u8124\u6DAFV!?v4fzbCL=e_>l7");
    }


}
