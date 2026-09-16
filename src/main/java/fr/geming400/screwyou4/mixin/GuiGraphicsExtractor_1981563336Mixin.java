package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.GuiGraphicsExtractor.class)
public class GuiGraphicsExtractor_1981563336Mixin {
        @Inject(at = @At("HEAD"), method = "map(Lnet/minecraft/client/renderer/state/MapRenderState;)V", cancellable = true)
    private void map_897256404(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(897256404L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fill(IIIII)V", cancellable = true)
    private void fill_2771062(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2771062L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fill(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/client/gui/render/TextureSetup;IIII)V", cancellable = true)
    private void fill_1270389348(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1270389348L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fill(Lcom/mojang/blaze3d/pipeline/RenderPipeline;IIIII)V", cancellable = true)
    private void fill__121988031(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-121988031L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "text(Lnet/minecraft/client/gui/Font;Lnet/minecraft/util/FormattedCharSequence;III)V", cancellable = true)
    private void text__1015718771(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1015718771L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "text(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIIZ)V", cancellable = true)
    private void text__848002768(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-848002768L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "text(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;III)V", cancellable = true)
    private void text__1436239282(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1436239282L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "text(Lnet/minecraft/client/gui/Font;Ljava/lang/String;III)V", cancellable = true)
    private void text__1792255720(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1792255720L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "text(Lnet/minecraft/client/gui/Font;Ljava/lang/String;IIIZ)V", cancellable = true)
    private void text_1000389542(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1000389542L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "text(Lnet/minecraft/client/gui/Font;Lnet/minecraft/util/FormattedCharSequence;IIIZ)V", cancellable = true)
    private void text__696768815(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-696768815L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "item(Lnet/minecraft/world/item/ItemStack;II)V", cancellable = true)
    private void item__37049460(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-37049460L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "item(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;III)V", cancellable = true)
    private void item__1628879957(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1628879957L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "item(Lnet/minecraft/world/item/ItemStack;III)V", cancellable = true)
    private void item__438491103(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-438491103L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requestCursor(Lcom/mojang/blaze3d/platform/cursor/CursorType;)V", cancellable = true)
    private void requestCursor_85499358(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(85499358L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "textRendererForWidget(Lnet/minecraft/client/gui/components/AbstractWidget;Lnet/minecraft/client/gui/GuiGraphicsExtractor$HoveredTextEffects;)Lnet/minecraft/client/gui/ActiveTextCollector;", cancellable = true)
    private void textRendererForWidget__1462049803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1462049803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "containsPointInScissor(II)Z", cancellable = true)
    private void containsPointInScissor_1349102744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1349102744L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSprite(Lnet/minecraft/client/resources/model/sprite/SpriteId;)Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;", cancellable = true)
    private void getSprite__1435168986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1435168986L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blitSprite(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/resources/Identifier;IIIIF)V", cancellable = true)
    private void blitSprite_2019763469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2019763469L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blitSprite(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/resources/Identifier;IIIII)V", cancellable = true)
    private void blitSprite_2022534032(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2022534032L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blitSprite(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/resources/Identifier;IIII)V", cancellable = true)
    private void blitSprite_1566359101(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1566359101L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blitSprite(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/resources/Identifier;IIIIIIII)V", cancellable = true)
    private void blitSprite__87622915(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-87622915L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blitSprite(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;IIIII)V", cancellable = true)
    private void blitSprite_595258510(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(595258510L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blitSprite(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;IIII)V", cancellable = true)
    private void blitSprite_1381770623(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1381770623L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blitSprite(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/resources/Identifier;IIIIIIIII)V", cancellable = true)
    private void blitSprite__2006268208(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2006268208L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "skin(Lnet/minecraft/client/model/Model$Simple;Lnet/minecraft/resources/Identifier;FFFFIIII)V", cancellable = true)
    private void skin_1273033011(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1273033011L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "textRenderer(Lnet/minecraft/client/gui/GuiGraphicsExtractor$HoveredTextEffects;Ljava/util/function/Consumer;)Lnet/minecraft/client/gui/ActiveTextCollector;", cancellable = true)
    private void textRenderer_1910200536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1910200536L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textRenderer(Lnet/minecraft/client/gui/GuiGraphicsExtractor$HoveredTextEffects;)Lnet/minecraft/client/gui/ActiveTextCollector;", cancellable = true)
    private void textRenderer_1166400796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1166400796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textRenderer()Lnet/minecraft/client/gui/ActiveTextCollector;", cancellable = true)
    private void textRenderer_572951087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(572951087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "book(Lnet/minecraft/client/model/object/book/BookModel;Lnet/minecraft/resources/Identifier;FFFIIII)V", cancellable = true)
    private void book__1086750282(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1086750282L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tooltip(Lnet/minecraft/client/gui/Font;Ljava/util/List;IILnet/minecraft/client/gui/screens/inventory/tooltip/ClientTooltipPositioner;Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void tooltip__95121466(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-95121466L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix3x2fStack;", cancellable = true)
    private void pose_937490488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(937490488L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setComponentTooltipForNextFrame(Lnet/minecraft/client/gui/Font;Ljava/util/List;II)V", cancellable = true)
    private void setComponentTooltipForNextFrame_1389326088(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1389326088L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setComponentTooltipForNextFrame(Lnet/minecraft/client/gui/Font;Ljava/util/List;IILnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void setComponentTooltipForNextFrame_779115664(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(779115664L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyCursor(Lcom/mojang/blaze3d/platform/Window;)V", cancellable = true)
    private void applyCursor__1474403036(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1474403036L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nextStratum()V", cancellable = true)
    private void nextStratum__1307201327(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1307201327L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disableScissor()V", cancellable = true)
    private void disableScissor_688365862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(688365862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "verticalLine(IIII)V", cancellable = true)
    private void verticalLine__1468778128(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1468778128L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fillGradient(IIIIII)V", cancellable = true)
    private void fillGradient__702960089(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-702960089L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "enableScissor(IIII)V", cancellable = true)
    private void enableScissor_177253889(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(177253889L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "textWithBackdrop(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIII)V", cancellable = true)
    private void textWithBackdrop_240087163(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(240087163L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bannerPattern(Lnet/minecraft/client/model/object/banner/BannerFlagModel;Lnet/minecraft/world/item/DyeColor;Lnet/minecraft/world/level/block/entity/BannerPatternLayers;IIII)V", cancellable = true)
    private void bannerPattern_1193900871(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1193900871L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "profilerChart(Ljava/util/List;IIII)V", cancellable = true)
    private void profilerChart__1525366506(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1525366506L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTooltipForNextFrame(Lnet/minecraft/client/gui/Font;Ljava/util/List;Ljava/util/Optional;Lnet/minecraft/client/gui/screens/inventory/tooltip/ClientTooltipPositioner;IIZLnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void setTooltipForNextFrame_1645909130(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1645909130L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTooltipForNextFrame(Lnet/minecraft/client/gui/Font;Ljava/util/List;Ljava/util/Optional;II)V", cancellable = true)
    private void setTooltipForNextFrame__470927568(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-470927568L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTooltipForNextFrame(Lnet/minecraft/client/gui/Font;Lnet/minecraft/world/item/ItemStack;II)V", cancellable = true)
    private void setTooltipForNextFrame_704915637(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(704915637L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTooltipForNextFrame(Ljava/util/List;II)V", cancellable = true)
    private void setTooltipForNextFrame__950167943(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-950167943L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTooltipForNextFrame(Lnet/minecraft/network/chat/Component;II)V", cancellable = true)
    private void setTooltipForNextFrame_1312465308(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1312465308L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTooltipForNextFrame(Lnet/minecraft/client/gui/Font;Ljava/util/List;Ljava/util/Optional;IILnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void setTooltipForNextFrame_939798712(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(939798712L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTooltipForNextFrame(Lnet/minecraft/client/gui/Font;Ljava/util/List;II)V", cancellable = true)
    private void setTooltipForNextFrame__737991359(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-737991359L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTooltipForNextFrame(Lnet/minecraft/client/gui/Font;Ljava/util/List;IILnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void setTooltipForNextFrame_48179785(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(48179785L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTooltipForNextFrame(Lnet/minecraft/client/gui/Font;Ljava/util/List;Lnet/minecraft/client/gui/screens/inventory/tooltip/ClientTooltipPositioner;IIZ)V", cancellable = true)
    private void setTooltipForNextFrame__547399279(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-547399279L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTooltipForNextFrame(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;II)V", cancellable = true)
    private void setTooltipForNextFrame__1696503196(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1696503196L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTooltipForNextFrame(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IILnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void setTooltipForNextFrame_514906604(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(514906604L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "centeredText(Lnet/minecraft/client/gui/Font;Ljava/lang/String;III)V", cancellable = true)
    private void centeredText__824898108(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-824898108L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "centeredText(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;III)V", cancellable = true)
    private void centeredText__2089787142(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2089787142L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "centeredText(Lnet/minecraft/client/gui/Font;Lnet/minecraft/util/FormattedCharSequence;III)V", cancellable = true)
    private void centeredText_1270205753(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1270205753L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "textWithWordWrap(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/FormattedText;IIIIZ)V", cancellable = true)
    private void textWithWordWrap__1983066287(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1983066287L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "textWithWordWrap(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/FormattedText;IIII)V", cancellable = true)
    private void textWithWordWrap_1990829069(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1990829069L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "itemDecorations(Lnet/minecraft/client/gui/Font;Lnet/minecraft/world/item/ItemStack;II)V", cancellable = true)
    private void itemDecorations__1477065581(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1477065581L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "itemDecorations(Lnet/minecraft/client/gui/Font;Lnet/minecraft/world/item/ItemStack;IILjava/lang/String;)V", cancellable = true)
    private void itemDecorations_622455901(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(622455901L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blurBeforeThisStratum()V", cancellable = true)
    private void blurBeforeThisStratum__690063646(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-690063646L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "horizontalLine(IIII)V", cancellable = true)
    private void horizontalLine__1321951358(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1321951358L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "textHighlight(IIIIZ)V", cancellable = true)
    private void textHighlight_1480390539(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1480390539L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractDeferredElements(IIF)V", cancellable = true)
    private void extractDeferredElements_1680542951(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1680542951L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPreeditOverlay(Lnet/minecraft/client/gui/components/Renderable;)V", cancellable = true)
    private void setPreeditOverlay_367797471(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(367797471L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "guiWidth()I", cancellable = true)
    private void guiWidth_400618818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(400618818L))
            info.setReturnValue(2086257776);
    }

    @Inject(at = @At("HEAD"), method = "guiHeight()I", cancellable = true)
    private void guiHeight__1563444565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1563444565L))
            info.setReturnValue(195869356);
    }

    @Inject(at = @At("HEAD"), method = "outline(IIIII)V", cancellable = true)
    private void outline_289224821(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(289224821L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blit(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/resources/Identifier;IIFFIIIII)V", cancellable = true)
    private void blit__1477300533(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1477300533L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blit(Lnet/minecraft/resources/Identifier;IIIIFFFF)V", cancellable = true)
    private void blit__2126713235(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2126713235L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blit(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/resources/Identifier;IIFFIIIIII)V", cancellable = true)
    private void blit__2136601406(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2136601406L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blit(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/resources/Identifier;IIFFIIII)V", cancellable = true)
    private void blit__486201438(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-486201438L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blit(Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuSampler;IIIIFFFF)V", cancellable = true)
    private void blit_990151579(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(990151579L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blit(Lcom/mojang/blaze3d/pipeline/RenderPipeline;Lnet/minecraft/resources/Identifier;IIFFIIIIIII)V", cancellable = true)
    private void blit__1100091989(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1100091989L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fakeItem(Lnet/minecraft/world/item/ItemStack;III)V", cancellable = true)
    private void fakeItem_1539237270(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1539237270L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fakeItem(Lnet/minecraft/world/item/ItemStack;II)V", cancellable = true)
    private void fakeItem_1689316215(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1689316215L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entity(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;FLorg/joml/Vector3fc;Lorg/joml/Quaternionfc;Lorg/joml/Quaternionfc;IIII)V", cancellable = true)
    private void entity_1797284752(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1797284752L))
            info.cancel();
    }


}
