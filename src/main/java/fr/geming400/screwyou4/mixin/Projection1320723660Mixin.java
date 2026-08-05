package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool.Projection.class)
public class Projection1320723660Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_185263189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(185263189L))
            info.setReturnValue("l\uAED9{'\u73F3^uu\u90722Txt\uC6462H,\u3064J5\u5D32tVyv{a\uA2ED\uCCE0l7\uB65E<;7\u0551'.=\"%|Yoh@z5AN*{tRVKZ\u1444zn\u95BCZ:pki6^ExT+:P\uD632\u4551'gg\u5508F\u1784eyCu$P\uFB8B\u6104z\u53C4");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/levelgen/structure/pools/StructureTemplatePool$Projection;", cancellable = true)
    private static void values_56442314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(56442314L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/pools/StructureTemplatePool$Projection;", cancellable = true)
    private static void valueOf__1178163347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1178163347L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool.Projection.RIGID);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/structure/pools/StructureTemplatePool$Projection;", cancellable = true)
    private static void byName__1178163347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1178163347L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool.Projection.RIGID);
    }

    @Inject(at = @At("HEAD"), method = "getProcessors()Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private void getProcessors__2006465103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2006465103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_185263189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(185263189L))
            info.setReturnValue("l\uAED9{'\u73F3^uu\u90722Txt\uC6462H,\u3064J5\u5D32tVyv{a\uA2ED\uCCE0l7\uB65E<;7\u0551'.=\"%|Yoh@z5AN*{tRVKZ\u1444zn\u95BCZ:pki6^ExT+:P\uD632\u4551'gg\u5508F\u1784eyCu$P\uFB8B\u6104z\u53C4");
    }


}
